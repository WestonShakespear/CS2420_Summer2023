package timekeeper.extended;

public class Trial {
    
    public int id;
    public int input;

    public Long[] trials;
    public long mean;
    public long median;


    public Trial(int _id, int _input, int _subTrialNumber)
    {
        this.id = _id;
        this.input = _input;

        this.trials = new Long[_subTrialNumber];
    }

    public void addIntoSortedArray(long x) {
		int spot = -1;
		for(int i = 0; i < this.trials.length; i++) {
			if (this.trials[i] == null || this.trials[i] > x) {
				spot = i;
				break;
			}
		}
		//found a spot, so let's shift the array to put x into its spot
		if(spot > -1) {
			for(int i = this.trials.length-1; i > spot; i--) {
				this.trials[i] = this.trials[i-1];
			}
			this.trials[spot] = x;
		}
	}


    public String allTrials(boolean csv)
    {
        String ret = "";
        String format = "";
        if (!csv)
        {
            format = "Trial, %4d, input size, %10d, time, %10d%n";
        }
        else
        {
            format = "%d, %d, %d%n";
        }


        for (int i = 0; i < this.trials.length; i++)
        {
            ret += String.format(format, this.id, this.input, this.trials[i]);
        }

        return ret.substring(0, ret.length() - 1);
    }

    public void compute()
    {
        for (int i = 0; i < trials.length; i++)
        {
            this.mean += trials[i];
        }
        this.mean /= trials.length;

        this.median = this.trials[trials.length / 2];
    }


    public String toString(boolean csv)
    {
        String format = "";
        if (!csv)
        {
            format = "Trial, %4d, input size, %10d, mean time, %10d, median time, %10d";
        }
        else
        {
            format = "%d, %d, %d, %d";
        }
        
        return String.format(
            format,
            id,
            input,
            mean,
            median);
    }
}
