package database;

import model.Guests;
import org.tinylog.Logger;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class GuestsRepository {

    /**
     * This find rows by selectedColumn in the Guests table.
     * @param selectedColumn
     * @param entity
     * @return a list of Guests
     */
    public List<Guests> findByColumn(String selectedColumn, String entity) {
        EntityManager em = EmfGetter.getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Guests> cq = cb.createQuery(Guests.class);
        Root<Guests> from = cq.from(Guests.class);
        if(entity.isEmpty()){
            cq.select(from);
        } else {
            if (selectedColumn.equals("id") || selectedColumn.equals("payment"))  {
                Integer number = Integer.parseInt(entity);
                cq.select(from).where(cb.equal(from.get(selectedColumn), number));
            }else if (selectedColumn.equals("id") || selectedColumn.equals("phonenumber")) {
                Integer number = Integer.parseInt(entity);
                cq.select(from).where(cb.equal(from.get(selectedColumn), number));
            }
            else if (selectedColumn.equals("startdate") || selectedColumn.equals("enddate")) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
                LocalTime time = LocalTime.parse(entity, dtf);
                cq.select(from).where(cb.equal(from.get(selectedColumn), time));
            } else {
                cq.select(from).where(cb.like(from.get(selectedColumn), "%" + entity + "%"));
            }
        }
        try {
            Query q = em.createQuery(cq);
            Logger.info("Select completed successful");
            return q.getResultList();
        } catch (Exception e) {
            Logger.error("Select failed");
        } finally {
            em.close();
        }
        return new ArrayList<>();
    }

    /**
     * Insert new guest in the table.
     * @param newGuest
     */
    public void insertGuests(Guests newGuest){
        EntityManager em = EmfGetter.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(newGuest);
            em.getTransaction().commit();
            Logger.info("Inserting new guest into the database successfully");
        }catch (Exception e){
            Logger.error("Inserting new guest into the database failed");
        }finally {
            em.close();
        }
    }

    /**
     * Allows you to change the data in the Guests table cells.
     * @param change
     */
    public void  commitChange(Guests change){
        EntityManager em = EmfGetter.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(change);
            em.getTransaction().commit();
            Logger.info("Commit success");
        }catch (Exception e){
            Logger.error("Commit failed");
        }finally {
            em.close();
        }
    }

    /**
     * Remove Guests from the table.
     * @param entity
     */
    public void removeGuests(Guests entity){
        EntityManager em = EmfGetter.getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.contains(entity) ? entity : em.merge(entity));
            em.getTransaction().commit();
            Logger.info("Entity removed from the database successfully");
        }catch (Exception e) {
            Logger.error("Remove failed");
        } finally {
            em.close();
        }
    }
}
