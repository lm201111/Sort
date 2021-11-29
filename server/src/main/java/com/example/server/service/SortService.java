package com.example.server.service;

import java.util.List;

abstract public class SortService {
    abstract protected List<Line> sortList(String target, List<Line> list);
}
