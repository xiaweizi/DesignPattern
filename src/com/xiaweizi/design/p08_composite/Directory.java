package com.xiaweizi.design.p08_composite;

import java.util.List;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p08_composite.Directory
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

abstract class Directory {
    private final String name;

    public Directory(String name) {
        this.name = name;
    }

    abstract void addDir(Directory directory);

    abstract void removeDir(Directory directory);

    abstract void clear();

    abstract List<Directory> getDirectories();

    abstract boolean isFile();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }

}
