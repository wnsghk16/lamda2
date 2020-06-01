package com.lamda.web.proxy;

@FunctionalInterface
public interface ISupplier<T> {
    public T get();
}
