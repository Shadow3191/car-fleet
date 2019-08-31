package pl.groupproject.carfleet.model;

@Getter
@Setter
@Entity
@Table(name = "cars")
@EntityListeners(AuditingEntityListener.class)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String carBrand;
    private String carModel;
    private String initialMileage;
    private String finaleMileage;
    private String vinNr;
    private int amountOfFuel;
    private boolean reservation;
    private String carUpdate;

    @ManyToMany(mappedBy = "cars")
    private List<Driver> drivers;

    public CarsDto carsDto(){
        return CarsDto.builder()
                .id(id)
                .carModel(carModel)
                .build();
    }

    public CarInformationDto carInformationDto(){
        return CarInformationDto.builder()
                .id(id)
                .carBrand(carBrand)
                .carModel(carModel)
                .initialMileage(initialMileage)
                .finaleMileage(finaleMileage)
                .vinNr(vinNr)
                .amountOfFuel(amountOfFuel)
                .build();
    }
    
    @ManyToOne
    @JoinColumn(name = "departures_id")
    private Departure departures;

    public Car(String carBrand, String carModel, String initialMileage, String finaleMileage, String vinNr) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.initialMileage = initialMileage;
        this.finaleMileage = finaleMileage;
        this.vinNr = vinNr;
    }

}