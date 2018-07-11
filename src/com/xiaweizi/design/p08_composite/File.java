package com.xiaweizi.design.p08_composite;

import java.util.List;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p08_composite.File
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class File extends Directory {

    public File(String name) {
        super(name);
    }

    @Override
    void addDir(Directory directory) {
        throw new UnsupportedOperationException();
    }

    @Override
    void removeDir(Directory directory) {
        throw new UnsupportedOperationException();
    }

    @Override
    void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    List<Directory> getDirectories() {
        throw new UnsupportedOperationException();
    }

    @Override
    boolean isFile() {
        return true;
    }

}
