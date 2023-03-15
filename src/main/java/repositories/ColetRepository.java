package repositories;

import models.Colet;

public interface ColetRepository {
    Colet getColetById(int id);
    Colet saveColet(Colet c);

    void deleteColet(Colet c);
    void updateColet(int id, String locDest, String locExp, Float valoare);
}
