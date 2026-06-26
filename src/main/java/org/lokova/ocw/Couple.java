package org.lokova.ocw;

import java.io.Serializable;
import java.util.Objects;

public class Couple implements Serializable {

	private static final long serialVersionUID = 1L;

	public static Couple of(Person p1, Person p2) {
		if (p1.getPartner().equals(p2)) {
			return p1.getCouple();
		}
		return new Couple(p1, p2);
	}

	private Person[] members = new Person[2];
	private boolean isReversible;

	private Couple(Person p1, Person p2) {
		Objects.requireNonNull(p1);
		Objects.requireNonNull(p2);
		if (p1.equals(p2)) {
			throw new IllegalArgumentException("A person must not marry himself/herself");
		}
		if ((p1.getPartner() != null) && (p2.getPartner() != null)) {
			throw new IllegalStateException("Both people already have a partner");
		}
		if (p1.getPartner() != null) {
			throw new IllegalArgumentException(p1 + "already has a partner");
		}
		if (p2.getPartner() != null) {
			throw new IllegalArgumentException(p2 + "already has a partner");
		}
		if ((p1.getPolarity() - p2.getPolarity()) > 25) {
			members[0] = p1;
			members[1] = p2;
			isReversible = false;
		} else if ((p2.getPolarity() - p1.getPolarity()) > 25) {
			members[0] = p2;
			members[1] = p1;
			isReversible = false;
		} else {
			members[0] = p1;
			members[1] = p2;
			isReversible = true;
		}
		p1.setPartner(p2);
		p2.setPartner(p1);
		p1.setCouple(this);
		p2.setCouple(this);
	}

	public Person[] getMembers() {
		return members.clone();
	}

	public boolean isReversible() {
		return isReversible;
	}

}