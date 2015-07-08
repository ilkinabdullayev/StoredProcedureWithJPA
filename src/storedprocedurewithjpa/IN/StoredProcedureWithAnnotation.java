package storedprocedurewithjpa.IN;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

/**
 *
 * @author Ilkin Abdullayev
 */
public class StoredProcedureWithAnnotation {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("StoredProcedureWithJPAPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StoredProcedureQuery storedProcedure = entityManager.createNamedStoredProcedureQuery("Region.insert");
        // parametr verilir
        storedProcedure.setParameter("reg_id", 5);
        storedProcedure.setParameter("reg_name", "Antarctica");
        //SP icra olunur
        storedProcedure.execute();

        System.out.println("Prosedur icra olundu");
        System.out.println("Proqram sonlandı");
    }

}
