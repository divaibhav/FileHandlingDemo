import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TextAnalyer {
    public static void main(String[] args) {
        TextAnalyer textAnalyer = new TextAnalyer();
        //String fileData = textAnalyer.readFile("C:\\Users\\Vaibhav.Diwan\\Desktop\\poem.txt");
        String fileData = textAnalyer.readFile("resource/poem.txt");
        System.out.println(fileData);



    }
    public String readFile(String poemFileName){
        String response = "";
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(poemFileName);
            int data = 0;
            while(data !=  -1){
                data = fileInputStream.read();
                char readData = (char) data;
                response = response + readData;
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println(e);
        }
        return response;
    }


}
