package com.biggestnerd.civradar;

import java.lang.reflect.Field;

import net.minecraft.client.Minecraft;

public class ReflectionHandler {
	
	public static double getRenderPos(String fieldName) {
		try {
			final Field field = Class.forName("net.minecraft.client.renderer.entity.RenderManager").getDeclaredField(fieldName);
			field.setAccessible(true);
			return field.getDouble(Minecraft.getMinecraft().getRenderManager());
	
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return 0;
	}
}