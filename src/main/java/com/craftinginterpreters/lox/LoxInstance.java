package com.craftinginterpreters.lox;

import java.util.HashMap;
import java.util.Map;

class LoxInstance {
    private LoxClass class_;

    LoxInstance(LoxClass class_) {
        this.class_ = class_;
    }

    @Override
    public String toString() {
        return class_.name + " instance";
    }
}