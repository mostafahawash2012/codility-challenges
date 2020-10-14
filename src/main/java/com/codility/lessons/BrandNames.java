package com.codility.lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BrandNames {

	public static String[] solution(int N, List<Brand> likedBrands, List<Brand> topGenderBrands) {

		List<String> liked = new ArrayList<>();
		List<String> gender = new ArrayList<>();
		String[] results = new String[N];
		int i = 0;
		if (likedBrands != null && likedBrands.size() > 0) {
			liked = likedBrands.stream().map(Brand::getName).collect(Collectors.toList());
		}
		if (topGenderBrands != null && topGenderBrands.size() > 0) {
			gender = topGenderBrands.stream().map(Brand::getName).collect(Collectors.toList());
		}
		for (i = 0; i < N && i < liked.size(); i++) {
			results[i] = liked.get(i);
		}

		if ((i) < N) {
			for (int j = 0; i < N && j < gender.size(); i++, j++) {
				results[i] = gender.get(j);
			}
		}
		if ((i + 1) < N) {
			// throw error
		}
		return results;
	}

	public static void main(String[] args) {

		Brand liked1 = new Brand("liked1");
		Brand liked2 = new Brand("liked2");
		Brand gender1 = new Brand("gender1");

		String[] sol = solution(4, new ArrayList<>(Arrays.asList(liked1, liked2)),
				new ArrayList<>(Arrays.asList(gender1)));
		System.out.println(Arrays.toString(sol));

	}

}

class User {
	String id;
	String gender;
}

class Brand {
	String id;
	String name;

	public Brand(String n) {
		name = n;
	}

	public String getName() {
		return this.name;
	}
}
