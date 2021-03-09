import java.io.*;

public class App03 {
    static String path="F:\\png.txt";
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\桌面\\蓝桥\\2021-03-04（视频+代码）\\BIGIMAGE");
        createListFile(file);

        FileReader fr=new FileReader(path);
        BufferedReader br=new BufferedReader(fr);
        String pngName="";
        FileOutputStream fos=new FileOutputStream("F:\\合并.dat");
        while((pngName=br.readLine())!=null){
            FileInputStream fis=new FileInputStream(pngName);
            int a=0;
            byte buff[]=new byte[1024];
            while((a=fis.read(buff))!=-1){
                fos.write(buff,0,a);
            }
            fis.close();
        }
        fos.close();
    }
    static void createListFile(File file) throws IOException {
        FileWriter fw=new FileWriter(path);
        File files[] = file.listFiles();
        for(int i=0;i<files.length;i++){
            if(files[i].getName().endsWith(".png")){
                String pngFilePath=files[i].getAbsolutePath();

                fw.write(pngFilePath+"\r");
            }
        }
        fw.close();
    }
}