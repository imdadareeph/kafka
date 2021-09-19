package com.imdadareeph.kafka;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KafkaMessage {

	private final String message;
	private final int identifier;

	public KafkaMessage(@JsonProperty("message") final String message,
						@JsonProperty("identifier") final int identifier) {
		this.message = message;
		this.identifier = identifier;
	}

	public String getMessage() {
		return message;
	}

	public int getIdentifier() {
		return identifier;
	}

	@Override
	public String toString() {
		return "KafkaMessage::toString() {" +
				"message='" + message + '\'' +
				", identifier=" + identifier +
				'}';
	}
}
