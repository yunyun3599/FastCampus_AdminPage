package com.example.study.ifs;

import com.example.study.model.network.Header;

public interface CrudInterface {

    Header create();        //todo request 추가

    Header read(Long id);

    Header update();

    Header delete(Long id);

}
