import org.example.EroeNonIdoneoException;
import org.example.Reclutatore;

import static java.lang.IO.println;

void main(){
    Reclutatore r = new Reclutatore(75);

    for(int i = 0;i<5;i++){
        try{
            r.Testa();
        }
        catch(EroeNonIdoneoException e){
            println(e.getMessage());
        }
        r.GeneraNuovoEroe();
    }
}