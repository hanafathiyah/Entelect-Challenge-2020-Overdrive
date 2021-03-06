package com.delta.stima.tubes1.command;

public class TweetCommand implements Command {
    private int lane;
    private int block;

    public TweetCommand(int lane, int block){
      this.lane = lane;
      this.block = block;
    }

    @Override
    public String render() {
        return String.format("USE_TWEET %d %d", this.lane, this.block);
    }
}
