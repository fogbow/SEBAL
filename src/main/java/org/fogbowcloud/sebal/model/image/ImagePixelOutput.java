package org.fogbowcloud.sebal.model.image;

public class ImagePixelOutput {

	private double NDVI;
	private double Ts;
	private double sAVI;
	private double Rn;
	private double G;
	private double H;
	private double lambdaE;
	private double alpha;
	private double epsilonNB;
	private double epsilonZero;
	private double z0mxy;
	private double[] rho;
	private double RLDown;
	private double epsilonA;
	private double RLUp;
	private double IAF;
	private double EVI;
	private double RSDown;
	private double tauSW;
	private double alphaToa;
	private double evapo24h;
	private double frEvapo;
	private double lambda24h;
	private double tau24h;
	private double rn24h;
	private boolean waterTest;
	private double NDSI;
	private boolean PCP;
	private double wCloudProb;
	private double lCloudProb;
	private boolean isCloud;

	public boolean isCloud() {
		return isCloud;
	}

	public void setIsCloud(boolean isCloud) {
		this.isCloud = isCloud;
	}

	public double getNDVI() {
		return NDVI;
	}

	public void setNDVI(double nDVI) {
		NDVI = nDVI;
	}

	public void setTs(double ts) {
		Ts = ts;
	}

	public double getTs() {
		return Ts;
	}

	public double SAVI() {
		return sAVI;
	}

	public void setSAVI(double SAVI) {
		sAVI = SAVI;
	}

	public void setRn(double rn) {
		this.Rn = rn;
	}

	public void setG(double g) {
		this.G = g;
	}

	public double Rn() {
		return Rn;
	}

	public double G() {
		return G;
	}

	public double getLambdaE() {
		return lambdaE;
	}

	public void setLambdaE(double lambdaE) {
		this.lambdaE = lambdaE;
	}

	public double getH() {
		return H;
	}

	public void setH(double h) {
		H = h;
	}

	public double getAlpha() {
		return alpha;
	}

	public void setAlpha(double alpha) {
		this.alpha = alpha;
	}

	public double getEpsilonNB() {
		return epsilonNB;
	}

	public void setEpsilonNB(double epsilonNB) {
		this.epsilonNB = epsilonNB;
	}

	public double getEpsilonZero() {
		return epsilonZero;
	}

	public void setEpsilonZero(double epsilonZero) {
		this.epsilonZero = epsilonZero;
	}

	public double getZ0mxy() {
		return z0mxy;
	}

	public void setZ0mxy(double z0mxy) {
		this.z0mxy = z0mxy;
	}

	public double[] getRho() {
		return rho;
	}

	public void setRho(double[] rho) {
		this.rho = rho;
	}

	public double getRLDown() {
		return RLDown;
	}

	public void setRLDown(double rLDown) {
		RLDown = rLDown;
	}

	public double getEpsilonA() {
		return epsilonA;
	}

	public void setEpsilonA(double epsilonA) {
		this.epsilonA = epsilonA;
	}

	public double getRLUp() {
		return RLUp;
	}

	public void setRLUp(double rLUp) {
		RLUp = rLUp;
	}

	public double getIAF() {
		return IAF;
	}

	public void setIAF(double iAF) {
		IAF = iAF;
	}

	public double getEVI() {
		return EVI;
	}

	public void setEVI(double eVI) {
		EVI = eVI;
	}

	public double getRSDown() {
		return RSDown;
	}

	public void setRSDown(double rSDown) {
		RSDown = rSDown;
	}

	public double getTauSW() {
		return tauSW;
	}

	public void setTauSW(double tauSW) {
		this.tauSW = tauSW;
	}

	public double getAlphaToa() {
		return alphaToa;
	}

	public void setAlphaToa(double alphaToa) {
		this.alphaToa = alphaToa;
	}

	public double getEvapo24h() {
		return evapo24h;
	}

	public void setEvapo24h(double evapo24h) {
		this.evapo24h = evapo24h;
	}

	public double getFrEvapo() {
		return frEvapo;
	}

	public void setFrEvapo(double frEvapo) {
		this.frEvapo = frEvapo;
	}

	public double getLambda24h() {
		return lambda24h;
	}

	public void setLambda24h(double lambda24h) {
		this.lambda24h = lambda24h;
	}

	public double getRn24h() {
		return rn24h;
	}

	public void setRn24h(double rn24h) {
		this.rn24h = rn24h;
	}

	public double getTau24h() {
		return tau24h;
	}

	public void setTau24h(double tau24h) {
		this.tau24h = tau24h;
	}

	public boolean getWaterTest() {
		return waterTest;
	}

	public void setWaterTest(boolean waterTest) {
		this.waterTest = waterTest;
	}

	public void setNDSI(double NDSI) {
		this.NDSI = NDSI;
	}

	public double getNDSI() {
		return NDSI;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof ImagePixelOutput) {
			ImagePixelOutput other = (ImagePixelOutput) o;
			return getNDVI() == other.getNDVI() && getTs() == other.getTs()
					&& SAVI() == other.SAVI() && getRn24h() == other.getRn24h() && G() == other.G()
					&& getH() == other.getH() && getLambdaE() == other.getLambdaE()
					&& getAlpha() == other.getAlpha() && getEpsilonNB() == other.getEpsilonNB()
					&& getEpsilonZero() == other.getEpsilonZero() && getZ0mxy() == other.getZ0mxy()
					&& getRLDown() == other.getRLDown() && getEpsilonA() == other.getEpsilonA()
					&& getRLUp() == other.getRLUp() && getIAF() == other.getIAF()
					&& getEVI() == other.getEVI() && getRSDown() == other.getRSDown()
					&& getTauSW() == other.getTauSW() && getAlphaToa() == other.getAlphaToa()
					&& getEvapo24h() == other.getEvapo24h() && getFrEvapo() == other.getFrEvapo()
					&& getLambda24h() == other.getLambda24h() && getTau24h() == other.getTau24h()
					&& getRn24h() == other.getRn24h() && getWaterTest() == other.getWaterTest()
					&& getNDSI() == other.getNDSI();
		}
		return false;
	}

	public boolean getClearSkyWater() {
		return getWaterTest() && rho[6] < 0.03;
	}

	public boolean getClearSkyLand() {
		return !PCP && !getWaterTest();
	}

	public void setPCP(boolean PCP) {
		this.PCP = PCP;
	}

	public boolean getPCP() {
		return PCP;
	}

	public void setWCloudProb(double wCloudProb) {
		this.wCloudProb = wCloudProb;
	}

	public double getWCloudProb() {
		return wCloudProb;
	}

	public void setLCloudProb(double lCloudProb) {
		this.lCloudProb = lCloudProb;
	}

	public double getLCloudProb() {
		return lCloudProb;
	}

}
