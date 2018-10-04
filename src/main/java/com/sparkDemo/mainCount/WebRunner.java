package com.sparkDemo.mainCount;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import spark.*;

public class WebRunner {
	public static void main(String[] args) {
		Spark.get("/", new Route() {
			@Override
			public Object handle(Request request, Response response) throws Exception {
				Map<String, Object> data = new HashMap<>();
				data.put("ID", UUID.randomUUID());
				return data;
			}
		});
	}
}
