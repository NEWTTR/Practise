package com.example.demo.control;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Train;
import com.example.demo.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrainController {

    private JSONObject result = new JSONObject();

    @Autowired
    private TrainService trainService;

    @RequestMapping("/selecttrainbynameline")
    public Object listhotel(@RequestParam(required=true,value="TrainNameLine")String TrainNameLine) {
        List<Train> train = trainService.selectbyTrainNameLine(TrainNameLine);
        result.put("train", train);
        return result;
    }

}
