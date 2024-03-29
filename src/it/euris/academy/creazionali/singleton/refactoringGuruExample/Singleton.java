package it.euris.academy.creazionali.singleton.refactoringGuruExample;

public final class Singleton {
        private static Singleton instance;
        public String value;

        //This implementation is not thread safe!
        private Singleton(String value) {
            // The following code emulates slow initialization.
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            this.value = value;
        }

        public static Singleton getInstance(String value) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
}
