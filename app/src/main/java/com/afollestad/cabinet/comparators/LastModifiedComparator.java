package com.afollestad.cabinet.comparators;

import com.afollestad.cabinet.file.base.File;

/**
 * @author Aidan Follestad (afollestad)
 */
public class LastModifiedComparator implements java.util.Comparator<File> {

    @Override
    public int compare(File lhs, File rhs) {
        if (rhs.lastModified() < lhs.lastModified()) {
            return -1;
        } else if (rhs.length() > lhs.length()) {
            return 1;
        } else {
            return 0;
        }
    }
}