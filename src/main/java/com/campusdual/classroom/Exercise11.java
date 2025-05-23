package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        //Encender la TV
        redRemote.turnOn();

        //Subir un canal
        redRemote.channelUp();

        //Bajar un canal
        redRemote.channelDown();

        //Establece el canal en 0, intentar bajar el volumen y comprobar que no se puede
        redRemote.channel=0;
        redRemote.channelDown();
        System.out.println("Canal actual: " + redRemote.channel);

        //Subir el volumen
        redRemote.volumeUp();

        //Bajar el volumen
        redRemote.volumeDown();

        //Establecer el volumen en 0, intentar bajar el volumen y comprobar que no se puede
        redRemote.volume=0;
        redRemote.volumeDown();
        System.out.println("Volumen actual: " + redRemote.volume);

        //Obtener el color del mando a distancia y mostrarlo por pantalla
        System.out.println("El color del mando es: " + redRemote.getColor());

        //Apagar la TV
        redRemote.turnOff();


    }

}