class ExampleR{
    class R{
        String one;
        R r;
        R(String one, R r)
        {
            this.one = one;
            this.r =r;
        }
    }
    R one;
    R ex = new R("one",one);
    TextTweet ones = new TextTweet("one", 0);
    ReplyTweet two = new ReplyTweet(ones, "why", 0);
    //It is not possible to reply to a reply to a Tweet without changing the field because the constructor of ReplyTweet will only take in textTweet.

}