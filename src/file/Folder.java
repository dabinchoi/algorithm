package file;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Folder {
    private String name;
    private List<File> files;
    private List<Folder> folders;


    public Folder(String name){
        this.name = name;
        files = new ArrayList<>();
        folders = new ArrayList<>();
    }

    public void rename(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public long getLength(){
        return 0; // length는 계산되야한다.
    }

    public void addFile(File file){
        files.add(file);
    }

    public void deleteFile(String fileName){
        // fileName으로 파일을 지운다.
    }

    // 토론꺼리. 왜 files 를 리턴하지 않고, files.iterator()를 리턴할까?
    public Iterator<File> fileIterator(){
        return files.iterator();
    }

    public void addFolder(Folder folder){
        folders.add(folder);
    }

    public void deleteFolder(String folderName){
        //folderName으로 폴더를 삭제한다.
    }

    public Iterator<Folder> foderIterator(){
        return folders.iterator();
    }

}

