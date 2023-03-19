package Model;

import java.util.List;

public interface ColetRepository {
    Colet getColetById(int id);

    Colet saveColet(Colet c);

    List<Colet> findColete();

    void deleteColet(Colet c);

    void updateColet(int id, String locDest, String locExp, Float valoare);

    void deleteColet(int id);

    void updateColet(Colet c);
}
