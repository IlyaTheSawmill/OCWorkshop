package org.lokova.io;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class LocalDateAdapter extends TypeAdapter<LocalDate> {

	private final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

	@Override
	public LocalDate read(JsonReader in) throws IOException {
		if (in.peek() == null) {
			return null;
		}
		String dateString = in.nextString();
		return LocalDate.parse(dateString, formatter);
	}

	@Override
	public void write(JsonWriter out, LocalDate value) throws IOException {
		if (value == null) {
			out.nullValue();
		} else {
			out.value(formatter.format(value));
		}
	}

}
