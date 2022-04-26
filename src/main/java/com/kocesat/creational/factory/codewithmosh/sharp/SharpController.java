package com.kocesat.creational.factory.codewithmosh.sharp;

import com.kocesat.creational.factory.codewithmosh.matcha.Controller;
import com.kocesat.creational.factory.codewithmosh.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
