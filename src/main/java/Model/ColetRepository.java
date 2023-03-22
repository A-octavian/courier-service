package Model;

import java.util.List;

public interface ColetRepository {
    Colet getColetById(int id);

    Colet saveColet(Colet c);

    List<Colet> findColete();


    boolean deleteColet(int id);

    void updateColet(Colet c);
}
