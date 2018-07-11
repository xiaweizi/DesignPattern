package com.xiaweizi.design.p08_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p08_composite.Folder
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class Folder extends Directory {

    private List<Directory> directories = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    void addDir(Directory directory) {
        directories.add(directory);
    }

    @Override
    void removeDir(Directory directory) {
        if (directories.contains(directory)) {
            directory.removeDir(directory);
        }
    }

    @Override
    void clear() {
        directories.clear();
    }

    @Override
    List<Directory> getDirectories() {
        return directories;
    }

    @Override
    boolean isFile() {
        return false;
    }

    @Override
    public String toString() {
        return "{" +
                "directories=" + directories +
                '}';
    }
}
