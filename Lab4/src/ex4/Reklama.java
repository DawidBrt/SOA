package ex4;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.*;

@ManagedBean
@ApplicationScoped
public class Reklama {
    private HashMap<String,Integer> clicks = new HashMap<>();

    public Reklama() {
        for(String path: paths){
            clicks.put(path,0);
        }
    }

    private List<String> paths = Arrays.asList("https://i.imgur.com/nyCTCHv.jpg","https://i.imgur.com/WxLLX9P.jpg","https://i.imgur.com/jkXzEvC.jpg?1");
    public String imgPath = paths.get(0);

    public HashMap<String, Integer> getClicks() {
        return clicks;
    }

    public void setClicks(HashMap<String, Integer> clicks) {
        this.clicks = clicks;
    }

    public String getImgPath() {
        imgPath = paths.get((int) Math.floor(Math.random()*(paths.size()-1)));
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public void randPath(){

    }

    public void onClick(String tmpPath){
        clicks.replace(tmpPath,clicks.get(tmpPath)+1);
    }
}