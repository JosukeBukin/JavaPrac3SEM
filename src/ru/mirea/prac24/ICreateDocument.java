package ru.mirea.prac24;

public abstract class ICreateDocument {
    protected abstract IDocument CreateNew();
    protected abstract IDocument CreateOpen();
}