package org.lokova.ocw;

public enum Alignment {

	LAWFUL_GOOD(true, false, false, true, false, false), NEUTRAL_GOOD(true, false, false, false, true, false),
	CHAOTIC_GOOD(true, false, false, false, false, true), LAWFUL_NEUTRAL(false, true, false, true, false, false),
	TRUE_NEUTRAL(false, true, false, false, true, false), CHAOTIC_NEUTRAL(false, true, false, false, false, true),
	LAWFUL_EVIL(false, false, true, true, false, false), NEUTRAL_EVIL(false, false, true, false, true, false),
	CHAOTIC_EVIL(false, false, true, false, false, true);

	private boolean isGood;
	private boolean isMorallyNeutral;
	private boolean isEvil;
	private boolean isLawful;
	private boolean isOrderlyNeutral;
	private boolean isChaotic;

	Alignment(boolean inLine1, boolean inLine2, boolean inLine3, boolean inRow1, boolean inRow2, boolean inRow3) {
		isGood = inLine1;
		isMorallyNeutral = inLine2;
		isEvil = inLine3;
		isLawful = inRow1;
		isOrderlyNeutral = inRow2;
		isChaotic = inRow3;
	}

	public boolean isChaotic() {
		return isChaotic;
	}

	public boolean isEvil() {
		return isEvil;
	}

	public boolean isGood() {
		return isGood;
	}

	public boolean isLawful() {
		return isLawful;
	}

	public boolean isMorallyNeutral() {
		return isMorallyNeutral;
	}

	public boolean isNeutral() {
		return isMorallyNeutral || isOrderlyNeutral;
	}

	public boolean isOrderlyNeutral() {
		return isOrderlyNeutral;
	}

}
