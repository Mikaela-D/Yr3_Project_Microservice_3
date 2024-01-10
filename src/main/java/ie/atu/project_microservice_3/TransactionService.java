package ie.atu.project_microservice_3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {
    private List<TransactionDetails> transactionList = new ArrayList<>();

    public String rentMovie(TransactionDetails transactionDetails) {
        transactionList.add(transactionDetails);
        return "Movie rented successfully";
    }

    public String returnMovie(TransactionDetails transactionDetails) {
        if (transactionList.removeIf(transaction ->
                transaction.getUserID() == transactionDetails.getUserID()
                        && transaction.getMovieID() == transactionDetails.getMovieID())) {
            return "Movie returned successfully";
        } else {
            return "Movie wasn't found in the transaction list";
        }
    }
}
