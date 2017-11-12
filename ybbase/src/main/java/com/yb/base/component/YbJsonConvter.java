package com.yb.base.component;

import java.lang.reflect.Type;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
/**
 * GSON转JSON的对象
 * @author y
 *
 */
public class YbJsonConvter {

	protected Gson gson = null;
	
	protected Gson regGson = null;

	public YbJsonConvter() {
		regGson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
		
		GsonBuilder builder = new GsonBuilder();

		builder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
			@Override
			public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
					throws JsonParseException {
				return new Date(json.getAsJsonPrimitive().getAsLong());
			}
		});
		gson = builder.create();
	}
	
//	protected String toJson(Object obj){
//		return gson.toJson(obj);
//	}
	
	public <T> T fromJson(String json,Class<T> classObj){
		return gson.fromJson(json, classObj);
	}
	
	public String toGson(Object obj){
		return regGson.toJson(obj);
	}
	
	public <T> T fromGson(String json,Class<T> classObj){
		return regGson.fromJson(json, classObj);
	}
}
