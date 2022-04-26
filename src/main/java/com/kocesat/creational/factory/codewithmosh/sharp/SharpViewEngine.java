package com.kocesat.creational.factory.codewithmosh.sharp;

import com.kocesat.creational.factory.codewithmosh.matcha.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "Sharp rendered html...";
    }
}
