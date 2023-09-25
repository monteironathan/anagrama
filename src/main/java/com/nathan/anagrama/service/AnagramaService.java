package com.nathan.anagrama.service;

import com.nathan.anagrama.payload.request.AnagramaRequest;
import com.nathan.anagrama.payload.response.AnagramaResponse;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class AnagramaService {

    public AnagramaResponse isAnagrama(AnagramaRequest request) {
        AnagramaResponse response = new AnagramaResponse();

        if(request.getPalavra1().length() != request.getPalavra2().length()){
            response.setAnagrama(false);
            return response;
        }

        char[] chars1 = request.getPalavra1().toCharArray();
        char[] chars2 = request.getPalavra2().toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        response.setAnagrama(Arrays.equals(chars1, chars2));
        return response;
    }
}
