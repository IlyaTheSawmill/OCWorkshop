package org.lokova.io;

import java.awt.Color;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class ColorAdapter extends TypeAdapter<Color> {

	@Override
	public Color read(JsonReader in) throws IOException {
		String hex = in.nextString().trim();
		if (hex.startsWith("#")) {
			hex = hex.substring(1);
		}

		if (hex.length() == 6) {
			int rgb = Integer.parseInt(hex, 16);
			return new Color(rgb);
		} else {
			throw new IOException("Invalid color format: " + hex);
		}
	}

	@Override
	public void write(JsonWriter out, Color color) throws IOException {
		if (color == null) {
			out.nullValue();
		} else {
			String hex = String.format("#%02X%02X%02X", color.getRed(), color.getGreen(), color.getBlue());
			out.value(hex);
		}
	}

}
