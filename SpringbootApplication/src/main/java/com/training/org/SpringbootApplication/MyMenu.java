package com.training.org.SpringbootApplication;

import java.awt.Menu;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@ConfigurationProperties("app")
public class MyMenu {
	private List<Menu> menus=new ArrayList<Menu>();

	private static class Menu{
		private String name;
		private String path;
		private String title;

		@Override
		public String toString() {
			return "Menu [name=" + name + ", path=" + path + ", title=" + title + "]";
		}

	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	@RequestMapping
	public String toString() {
		return "MyMenu [menus=" + menus + "]";
	}


}
