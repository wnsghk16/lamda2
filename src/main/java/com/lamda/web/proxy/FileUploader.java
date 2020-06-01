package com.lamda.web.proxy;

import com.lamda.web.music.Music;
import com.lamda.web.music.MusicRepository;
import com.lamda.web.soccer.Player;
import com.lamda.web.soccer.PlayerDTO;
import com.lamda.web.soccer.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service("uploader") @Lazy
public class FileUploader extends Proxy{
    @Autowired Inventory<String> inventory;
    @Autowired PlayerRepository playerRepository;
    @Autowired MusicRepository musicRepository;
    //@Autowired Player player;

    public void upload(){
        inventory.clear();
        try{
            BufferedReader reader = new BufferedReader(
                    new FileReader(
                            new File("C:\\Users\\bit22\\IdeaProjects\\web\\src\\main\\resources\\static\\files\\player.csv")));
            String player = "";
            while((player = reader.readLine()) != null){
                inventory.add(player);
            }
            reader.close();
        }catch(Exception e){
            print("파일 리딩 에러");
            e.printStackTrace();
        }

        print("\n****************************************************************\n");
        print(inventory.get().get(0).toString());
        String[] arr = inventory.get().get(0).split(",");

        Player p = new Player();
        p.setPlayerId(arr[0]);
        p.setPlayerName(arr[1]);
        p.setEPlayerName(arr[3]);
        p.setNickname(arr[4]);
        p.setJoinYyyy(arr[5]);
        p.setPosition(arr[6]);
        p.setBackNo(arr[7]);
        p.setNation(arr[8]);
        p.setBirthDate(arr[9]);
        p.setSolar(arr[10]);
        p.setHeight(arr[11]);
        p.setWeight(arr[12]);
        playerRepository.save(p);

    }
}
