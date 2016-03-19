package com.company;

import java.util.List;

/**
 * Created by Prizrak on 16.03.2016.
 */
public interface IStringRowsListSorter {

    void sort(List<String[]> rows, int columnIndex);
    void print(List<String[]> rows);
}
