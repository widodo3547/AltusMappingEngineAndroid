package us.ba3.altusdemo.internetmaptests;
import us.ba3.altusdemo.METest;


public class MapBoxLandcoverTest extends METest {

	public MapBoxLandcoverTest(){
		this.name="MapBox Streets";
	}
	
	@Override
	public void start() {
		mapView.addInternetMap(this.name,"http://a.tiles.mapbox.com/v3/dxjacob.map-s5qr595q", "png");
	}

	@Override
	public void stop() {
		mapView.removeMap(this.name, false);
	}
}
