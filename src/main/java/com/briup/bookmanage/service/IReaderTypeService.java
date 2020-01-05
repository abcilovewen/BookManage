package com.briup.bookmanage.service;

import com.briup.bookmanage.bean.ReaderType;

public interface IReaderTypeService {
    ReaderType find(int id) throws RuntimeException;
}
