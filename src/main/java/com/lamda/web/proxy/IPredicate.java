package com.lamda.web.proxy;

@FunctionalInterface
public interface IPredicate<T> {
    public boolean test(T t);
}
