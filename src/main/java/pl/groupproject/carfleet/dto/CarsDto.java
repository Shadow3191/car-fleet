package pl.groupproject.carfleet.dto;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class CarsDto {
    private Long id;
    private String carBrand;
    private String carModel;
    private String vinNr;
    private boolean reservation;
    private String update;
}
