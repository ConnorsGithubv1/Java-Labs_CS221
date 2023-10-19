interface OnWatch {
	void observeEncounter(Encounter encounter);

	void stayAwakeForWatch(LongRest longRest);

	default void goToSleep(LongRest longRest) {
        longRest.goToSleep(this);
    }
}