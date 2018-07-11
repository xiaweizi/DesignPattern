package com.xiaweizi.design.p08_composite;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p08_composite.CompositeDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class CompositeDemo {
    public static void main(String[] args) {
        Directory root = new Folder("C");
        root.addDir(new Folder("windows"));

        Directory program = new Folder("Program file");
        program.addDir(new Folder("Intellij"));
        program.addDir(new File("cache"));
        root.addDir(program);

        root.addDir(new File("log.txt"));
        root.addDir(new Folder("windows"));
        System.out.println(root.toString());

        System.out.println();
        printFile(root);
        System.out.println();
        printFolder(root);
    }

    private static void printFile(Directory directory) {
        if (directory.isFile()) {
            System.out.println(directory.toString());
        } else {
            for (Directory directory1 : directory.getDirectories()) {
                printFile(directory1);
            }
        }
    }

    private static void printFolder(Directory directory) {
        if (!directory.isFile()) {
            System.out.println(directory.getName());
            if (directory.getDirectories() != null && directory.getDirectories().size() > 0) {
                for (Directory directory1 : directory.getDirectories()) {
                    printFolder(directory1);
                }
            }
        }
    }
}
