package com.gk.study.java.spring.aop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.study.java.spring.aop.aspects.Loggable;
import com.gk.study.java.spring.aop.model.Circle;
import com.gk.study.java.spring.aop.model.Triangle;

@Service(value="shapeService")
public class ShapeService {


	@Autowired
	private Circle circle;
	@Autowired
	private Triangle triangle;

	@Loggable
	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

}
