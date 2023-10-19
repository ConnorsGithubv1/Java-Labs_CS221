import java.util.ArrayList;

public class NightInTheWilderness implements LongRest {

	private Encounter encounter;
	private ArrayList<OnWatch> awakeCharacters = new ArrayList<>();

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
		this.somethingHappened();
	}

	@Override
	public void stayAwake(OnWatch watcher) {
		if (!awakeCharacters.contains(watcher)){
			awakeCharacters.add(watcher);
		}
	}

	@Override
	public void goToSleep(OnWatch watcher) {
		awakeCharacters.remove(watcher);
	}

	@Override
	public void somethingHappened() {
		for(OnWatch watcher : awakeCharacters){
			watcher.observeEncounter(encounter);
		}
	}

}