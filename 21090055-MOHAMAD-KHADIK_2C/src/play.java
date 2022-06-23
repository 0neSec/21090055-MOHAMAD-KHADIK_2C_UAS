import model.ConnectURI;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class play {
    public static void main(String[] args) throws IOException {



        ArrayList<Googleplay> _StudentTI = new ArrayList<Googleplay>();
        try {
            String Name;
            String Desc;
            String icon;
            Googleplay s = new Googleplay();
            s.set_nama(Nama);
            s.set_description(Desc);
            s.set_icon(icon);
            _StudentTI.add(s);
        } catch (Exception e){
            e.printStackTrace();
        }
        

        // Send Student data to database Cloud
        ConnectURI myUriBuilder = new ConnectURI();
        URL myAddress = myUriBuilder.buildURL("https://harber.mimoapps.xyz/fromjava.php");
        myUriBuilder.GetJSON(myAddress,jsonStudent.toString());


    }

    public static class Googleplay {
            public String _nama;
            public String _description;
            public String _icon;

            public Googleplay(){

            }
            public Googleplay(String nama, String dec, String icon ){
                this._nama =nama;
                this._description= dec;
                this._icon = icon;
            }
            public String get_nama(){
                return _nama;
            }
            public void set_nama(String _nama){
                this._nama= _nama;
            }
            public String det_description(){
                return _description;

            }
            public void set_description(String _description){

                this._description= _description;
            }
            public String det_icon(){
            return _icon;

            }
            public void set_icon(String _icon){

            this._icon = _icon;
        }
    }
}

}
