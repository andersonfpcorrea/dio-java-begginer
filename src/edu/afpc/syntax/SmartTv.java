package edu.afpc.syntax;

public class SmartTv {
        boolean turnedOn = false;
        int channel = 1;
        int volume = 25;

        public void toggleOn() {
            turnedOn = !turnedOn;
        }

        public void raiseVolume () {
            if (volume <= 100) volume++;
        }

        public void lowerVolume () {
            if (this.volume >= 0) this.volume--;
        }

        public void changeChannel ( int newChannel){
            this.channel = newChannel;
        }
}

