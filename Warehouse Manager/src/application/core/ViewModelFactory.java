package application.core;

public class ViewModelFactory {
	private ModelFactory mf;
	
	public ViewModelFactory(ModelFactory mf) {
		this.mf = mf;
		}
    public UppercaseViewModel getUppercaseVM() {
        return new UppercaseViewModel(mf.getTextConverterModel());
    }
}
