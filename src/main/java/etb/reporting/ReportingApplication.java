package etb.reporting;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ReportingApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ReportingApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

//        System.out.println("#######################"+args);
//
//        SimpleDateFormat d=new SimpleDateFormat("dd/MM/yyyy");
//        bookingRepository.save(
//                   new Booking(null,d.parse("12/12/2012"),d.parse("12/12/2012"))
//        );
//        bookingRepository.save(
//                new Booking(null,d.parse("12/12/2012"),d.parse("12/12/2012"))
//        );
//        bookingRepository.save(
//                new Booking(null,d.parse("12/12/2012"),d.parse("12/12/2012"))
//        );
//        bookingRepository.save(
//                new Booking(null,d.parse("12/12/2012"),d.parse("12/12/2012"))
//        );
//        bookingRepository.save(
//                new Booking(null,d.parse("12/12/2012"),d.parse("12/12/2012"))
//        );
//        bookingRepository.save(
//                new Booking(null,d.parse("12/12/2012"),d.parse("12/12/2012"))
//        );
    }
}
