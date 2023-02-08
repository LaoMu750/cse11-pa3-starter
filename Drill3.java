class TextTweet{
    String contents;
    int likes;
    TextTweet(String contents,int likes){
        this.contents = contents;
        this.likes = likes;
    }
    Boolean hasMention(String username)
    {
        if(contents.contains(username)==false)
        {
                return false;
        }
        char[] usercharr = username.toCharArray();
        char[] contarr = contents.toCharArray();
        for(int i=0;i<contarr.length;i++)
        {
            if(contarr[i]=='@')
            {
                Boolean equal = false;
                int k=0;
                int j=i+1;
                while(contarr[j]!=' '){
                    try{
                        if(contarr[j]!=usercharr[k])
                        {
                            equal = false;
                            break;
                        }
                        else{
                            j++;
                            k++;
                            equal = true;
                        }
                        
                    }
                    catch (IndexOutOfBoundsException e){
                        equal = false;
                        break;
                    }
                }
                if(equal ==true)
                {
                    return true;
                }
            }
        }
        return false;
    }
    Boolean hasLikes(){
        if(this.likes>=1)
        {
            return true;
        }
        return false;
    }
    String firstMention(){
        if(!contents.contains("@"))
        {
            return "";
        }
        char[] contarr = contents.toCharArray();
        for(int i=0;i<contarr.length;i++)
        {
            if(contarr[i]=='@')
            {
                //
                Boolean hasSpace = false;
                int k=0;
                for(int j=i+1;j<contarr.length;j++)
                {
                    if(contarr[j]==' '){
                        k=j;
                        hasSpace=true;
                        break;
                    }
                }
                if(hasSpace==false){
                    return "";
                }
                else{
                    char[] copy = new char[k-i];
                    int j=i+1;
                    for(int m=0;m<k-i;m++)
                    {
                        copy[m] =contarr[j];
                        j++;
                    }
                    String mention = copy.toString();
                    return mention;
                }
            }
        }
        return "";
    }
}

class ReplyTweet{
    TextTweet replyTo;
    String contents;
    int likes;
    ReplyTweet(TextTweet replyTo,String contents,int likes){
        this.replyTo = replyTo;
        this.contents = contents;

        this.likes = likes;
    
    }
    Boolean morePopularReply(){
        if(this.likes > this.replyTo.likes)
        {
            return true;
        }
        return false;
    }

    int allLikes(){
        int total =  this.likes + replyTo.likes;
        return total;
    }
    Boolean hasMention(String username)
    {
        if(this.replyTo.hasMention(username)==true)
        {
            return true;
        }
        if(contents.contains(username)==false)
        {
                return false;
        }
        char[] usercharr = username.toCharArray();
        char[] contarr = contents.toCharArray();
        for(int i=0;i<contarr.length;i++)
        {
            if(contarr[i]=='@')
            {
                Boolean equal = false;
                int k=0;
                int j=i+1;
                while(contarr[j]!=' '){
                    try{
                        if(contarr[j]!=usercharr[k])
                        {
                            equal = false;
                            break;
                        }
                        else{
                            j++;
                            k++;
                            equal = true;
                        }
                        
                    }
                    catch (IndexOutOfBoundsException e){
                        equal = false;
                        break;
                    }
                }
                if(equal ==true)
                {
                    return true;
                }
            }
        }
        return false;
    }
}